package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Dark_mode: ImageVector
    get() {
        if (_Dark_mode != null) return _Dark_mode!!
        
        _Dark_mode = ImageVector.Builder(
            name = "dark_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.37f, 5.51f)
                curveTo(9.19f, 6.15f, 9.1f, 6.82f, 9.1f, 7.5f)
                curveToRelative(0f, 4.08f, 3.32f, 7.4f, 7.4f, 7.4f)
                curveToRelative(0.68f, 0f, 1.35f, -0.09f, 1.99f, -0.27f)
                curveTo(17.45f, 17.19f, 14.93f, 19f, 12f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveTo(5f, 9.07f, 6.81f, 6.55f, 9.37f, 5.51f)
                close()
                moveTo(12f, 3f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                curveToRelative(0f, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f)
                curveToRelative(-0.98f, 1.37f, -2.58f, 2.26f, -4.4f, 2.26f)
                curveToRelative(-2.98f, 0f, -5.4f, -2.42f, -5.4f, -5.4f)
                curveToRelative(0f, -1.81f, 0.89f, -3.42f, 2.26f, -4.4f)
                curveTo(12.92f, 3.04f, 12.46f, 3f, 12f, 3f)
                lineTo(12f, 3f)
                close()
            }
        }.build()
        
        return _Dark_mode!!
    }

private var _Dark_mode: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.School: ImageVector
    get() {
        if (_School != null) return _School!!
        
        _School = ImageVector.Builder(
            name = "school",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 13.18f)
                verticalLineToRelative(2.81f)
                curveToRelative(0f, 0.73f, 0.4f, 1.41f, 1.04f, 1.76f)
                lineToRelative(5f, 2.73f)
                curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0f)
                lineToRelative(5f, -2.73f)
                curveToRelative(0.64f, -0.35f, 1.04f, -1.03f, 1.04f, -1.76f)
                verticalLineToRelative(-2.81f)
                lineToRelative(-6.04f, 3.3f)
                curveToRelative(-0.6f, 0.33f, -1.32f, 0.33f, -1.92f, 0f)
                lineTo(5f, 13.18f)
                close()
                moveToRelative(6.04f, -9.66f)
                lineToRelative(-8.43f, 4.6f)
                curveToRelative(-0.69f, 0.38f, -0.69f, 1.38f, 0f, 1.76f)
                lineToRelative(8.43f, 4.6f)
                curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0f)
                lineTo(21f, 10.09f)
                verticalLineTo(16f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(9.59f)
                curveToRelative(0f, -0.37f, -0.2f, -0.7f, -0.52f, -0.88f)
                lineToRelative(-9.52f, -5.19f)
                curveToRelative(-0.6f, -0.32f, -1.32f, -0.32f, -1.92f, 0f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null


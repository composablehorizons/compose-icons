package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`4k`: ImageVector
    get() {
        if (_4k != null) return _4k!!
        
        _4k = ImageVector.Builder(
            name = "4k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, 9.76f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(11f)
                verticalLineToRelative(0.74f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(9.75f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9.75f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(12f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.01f)
                close()
                moveToRelative(5.47f, 1.14f)
                curveToRelative(0.22f, 0.33f, 0.13f, 0.77f, -0.2f, 0.98f)
                curveToRelative(-0.12f, 0.08f, -0.26f, 0.12f, -0.39f, 0.12f)
                curveToRelative(-0.23f, 0f, -0.45f, -0.11f, -0.59f, -0.32f)
                lineTo(14.5f, 12f)
                verticalLineToRelative(2.24f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.41f, 0.01f, -0.75f, -0.33f, -0.75f, -0.74f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.24f)
                lineToRelative(1.79f, -2.68f)
                curveToRelative(0.22f, -0.33f, 0.66f, -0.41f, 0.98f, -0.2f)
                curveToRelative(0.33f, 0.22f, 0.41f, 0.66f, 0.2f, 0.98f)
                lineTo(16.2f, 12f)
                lineToRelative(1.27f, 1.9f)
                close()
            }
        }.build()
        
        return _4k!!
    }

private var _4k: ImageVector? = null


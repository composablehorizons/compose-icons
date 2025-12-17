package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Real_estate_agent: ImageVector
    get() {
        if (_Real_estate_agent != null) return _Real_estate_agent!!
        
        _Real_estate_agent = ImageVector.Builder(
            name = "real_estate_agent",
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
                moveTo(3f, 22f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                close()
                moveTo(11.37f, 16.43f)
                lineToRelative(1.47f, 0.51f)
                curveToRelative(0.11f, 0.04f, 0.22f, 0.06f, 0.33f, 0.06f)
                horizontalLineToRelative(6.83f)
                curveToRelative(1.11f, 0f, 2f, 0.89f, 2.01f, 2f)
                lineToRelative(0f, 0f)
                lineToRelative(-7.39f, 2.77f)
                curveToRelative(-0.4f, 0.15f, -0.84f, 0.17f, -1.25f, 0.05f)
                lineTo(7f, 20.02f)
                verticalLineTo(11f)
                horizontalLineTo(8.6f)
                curveToRelative(0.24f, 0f, 0.48f, 0.04f, 0.7f, 0.13f)
                lineToRelative(6.93f, 2.59f)
                curveToRelative(0.46f, 0.17f, 0.77f, 0.61f, 0.77f, 1.11f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.65f, -0.53f, 1.18f, -1.18f, 1.18f)
                horizontalLineToRelative(-2.63f)
                curveToRelative(-0.12f, 0f, -0.24f, -0.02f, -0.36f, -0.07f)
                lineToRelative(-1.12f, -0.43f)
                curveToRelative(-0.26f, -0.1f, -0.55f, 0.04f, -0.64f, 0.3f)
                curveTo(10.98f, 16.06f, 11.11f, 16.34f, 11.37f, 16.43f)
                close()
                moveTo(20.16f, 5.9f)
                lineToRelative(-5f, -3.57f)
                curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0f)
                lineToRelative(-5f, 3.57f)
                curveTo(7.31f, 6.28f, 7f, 6.88f, 7f, 7.53f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.25f, 0f, 0.51f, 0.05f, 0.74f, 0.14f)
                lineToRelative(7.79f, 3.11f)
                curveTo(18.26f, 12.71f, 19f, 13.79f, 19f, 15f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.53f)
                curveTo(21f, 6.88f, 20.69f, 6.28f, 20.16f, 5.9f)
                close()
                moveTo(13f, 10f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(12.5f, 9.22f, 12.72f, 9f, 13f, 9f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveTo(13.5f, 9.78f, 13.28f, 10f, 13f, 10f)
                close()
                moveTo(13f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(12.5f, 7.22f, 12.72f, 7f, 13f, 7f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveTo(13.5f, 7.78f, 13.28f, 8f, 13f, 8f)
                close()
                moveTo(15f, 10f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(14.5f, 9.22f, 14.72f, 9f, 15f, 9f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveTo(15.5f, 9.78f, 15.28f, 10f, 15f, 10f)
                close()
                moveTo(15f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(14.5f, 7.22f, 14.72f, 7f, 15f, 7f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveTo(15.5f, 7.78f, 15.28f, 8f, 15f, 8f)
                close()
            }
        }.build()
        
        return _Real_estate_agent!!
    }

private var _Real_estate_agent: ImageVector? = null


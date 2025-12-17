package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Holiday_village: ImageVector
    get() {
        if (_Holiday_village != null) return _Holiday_village!!
        
        _Holiday_village = ImageVector.Builder(
            name = "holiday_village",
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
                moveTo(17f, 20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(8.76f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-3.76f, -3.76f)
                curveTo(13.76f, 4.11f, 13.51f, 4f, 13.24f, 4f)
                curveToRelative(-0.89f, 0f, -1.34f, 1.08f, -0.71f, 1.71f)
                lineToRelative(3.32f, 3.32f)
                curveTo(15.95f, 9.12f, 16f, 9.25f, 16f, 9.38f)
                verticalLineTo(19f)
                curveTo(16f, 19.55f, 16.45f, 20f, 17f, 20f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(7.11f)
                curveToRelative(0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-2.1f, -2.11f)
                curveTo(19.42f, 4.11f, 19.16f, 4f, 18.9f, 4f)
                curveTo(18f, 4f, 17.56f, 5.08f, 18.19f, 5.71f)
                lineToRelative(1.67f, 1.67f)
                curveTo(19.95f, 7.47f, 20f, 7.6f, 20f, 7.73f)
                verticalLineTo(19f)
                curveTo(20f, 19.55f, 20.45f, 20f, 21f, 20f)
                close()
                moveTo(8f, 15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8.59f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-5f, -5f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-5f, 5f)
                curveTo(2.11f, 9.89f, 2f, 10.15f, 2f, 10.41f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveTo(7f, 15.45f, 7.45f, 15f, 8f, 15f)
                close()
                moveTo(8f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveTo(8.55f, 13f, 8f, 13f)
                close()
            }
        }.build()
        
        return _Holiday_village!!
    }

private var _Holiday_village: ImageVector? = null


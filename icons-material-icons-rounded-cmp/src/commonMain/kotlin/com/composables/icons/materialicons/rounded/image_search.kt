package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Image_search: ImageVector
    get() {
        if (_Image_search != null) return _Image_search!!
        
        _Image_search = ImageVector.Builder(
            name = "image_search",
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
                moveTo(18f, 15f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(-2.5f, 3f)
                horizontalLineTo(6.52f)
                curveToRelative(-0.42f, 0f, -0.65f, -0.48f, -0.39f, -0.81f)
                lineToRelative(1.74f, -2.23f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f)
                lineToRelative(1.56f, 1.88f)
                lineToRelative(2.35f, -3.02f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.79f, 0.01f)
                lineToRelative(2.55f, 3.39f)
                curveToRelative(0.25f, 0.32f, 0.01f, 0.79f, -0.4f, 0.79f)
                close()
                moveToRelative(3.8f, -9.11f)
                curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f)
                curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f)
                curveTo(13.3f, 1.73f, 11f, 3.84f, 11f, 6.5f)
                curveToRelative(0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineToRelative(2.41f, 2.41f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                lineToRelative(-2.41f, -2.4f)
                close()
                moveTo(15.5f, 9f)
                curveTo(14.12f, 9f, 13f, 7.88f, 13f, 6.5f)
                reflectiveCurveTo(14.12f, 4f, 15.5f, 4f)
                reflectiveCurveTo(18f, 5.12f, 18f, 6.5f)
                reflectiveCurveTo(16.88f, 9f, 15.5f, 9f)
                close()
            }
        }.build()
        
        return _Image_search!!
    }

private var _Image_search: ImageVector? = null


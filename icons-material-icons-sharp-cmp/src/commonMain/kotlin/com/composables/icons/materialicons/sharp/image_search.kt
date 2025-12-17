package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Image_search: ImageVector
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
                moveTo(18f, 13f)
                verticalLineToRelative(7f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(5.02f)
                curveToRelative(0.05f, -0.71f, 0.22f, -1.38f, 0.48f, -2f)
                horizontalLineTo(2f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-7f)
                lineToRelative(-2f, -2f)
                close()
                moveToRelative(-1.5f, 5f)
                horizontalLineToRelative(-11f)
                lineToRelative(2.75f, -3.53f)
                lineToRelative(1.96f, 2.36f)
                lineToRelative(2.75f, -3.54f)
                lineTo(16.5f, 18f)
                close()
                moveToRelative(2.8f, -9.11f)
                curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                curveTo(20f, 4.01f, 17.99f, 2f, 15.5f, 2f)
                reflectiveCurveTo(11f, 4.01f, 11f, 6.5f)
                reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineTo(21f, 13.42f)
                lineTo(22.42f, 12f)
                lineTo(19.3f, 8.89f)
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


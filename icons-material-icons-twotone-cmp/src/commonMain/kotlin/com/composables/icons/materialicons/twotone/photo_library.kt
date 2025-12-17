package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Photo_library: ImageVector
    get() {
        if (_Photo_library != null) return _Photo_library!!
        
        _Photo_library = ImageVector.Builder(
            name = "photo_library",
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
                moveTo(8f, 16f)
                horizontalLineToRelative(12f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(3.5f, -4.33f)
                lineToRelative(1.69f, 2.26f)
                lineToRelative(2.48f, -3.09f)
                lineTo(19f, 15f)
                horizontalLineTo(9f)
                lineToRelative(2.5f, -3.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 16f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveToRelative(-2f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-4.33f, -5.17f)
                lineToRelative(-2.48f, 3.09f)
                lineToRelative(-1.69f, -2.25f)
                lineTo(9f, 15f)
                horizontalLineToRelative(10f)
                close()
                moveTo(4f, 22f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Photo_library!!
    }

private var _Photo_library: ImageVector? = null


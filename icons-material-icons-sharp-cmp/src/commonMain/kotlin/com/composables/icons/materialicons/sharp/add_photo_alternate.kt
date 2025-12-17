package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_photo_alternate: ImageVector
    get() {
        if (_Add_photo_alternate != null) return _Add_photo_alternate!!
        
        _Add_photo_alternate = ImageVector.Builder(
            name = "add_photo_alternate",
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
                moveTo(19f, 7f)
                verticalLineToRelative(2.99f)
                reflectiveCurveToRelative(-1.99f, 0.01f, -2f, 0f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                reflectiveCurveToRelative(0.01f, -1.99f, 0f, -2f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-3f, 4f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineTo(11f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(5f, 19f)
                lineToRelative(3f, -4f)
                lineToRelative(2f, 3f)
                lineToRelative(3f, -4f)
                lineToRelative(4f, 5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Add_photo_alternate!!
    }

private var _Add_photo_alternate: ImageVector? = null


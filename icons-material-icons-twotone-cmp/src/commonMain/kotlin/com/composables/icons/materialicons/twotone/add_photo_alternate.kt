package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Add_photo_alternate: ImageVector
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
                moveTo(10.21f, 16.83f)
                lineToRelative(-1.96f, -2.36f)
                lineTo(5.5f, 18f)
                horizontalLineToRelative(11f)
                lineToRelative(-3.54f, -4.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 18f)
                horizontalLineToRelative(-11f)
                lineToRelative(2.75f, -3.53f)
                lineToRelative(1.96f, 2.36f)
                lineToRelative(2.75f, -3.54f)
                lineTo(16.5f, 18f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineTo(10f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.99f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(10f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Add_photo_alternate!!
    }

private var _Add_photo_alternate: ImageVector? = null


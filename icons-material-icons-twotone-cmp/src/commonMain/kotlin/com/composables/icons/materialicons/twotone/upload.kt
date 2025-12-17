package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Upload: ImageVector
    get() {
        if (_Upload != null) return _Upload!!
        
        _Upload = ImageVector.Builder(
            name = "upload",
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
                moveTo(9.83f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.17f)
                lineTo(12f, 5.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                lineToRelative(-7f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                lineToRelative(-7f, -7f)
                close()
                moveToRelative(1f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8f)
                horizontalLineTo(9.83f)
                lineTo(12f, 5.83f)
                lineTo(14.17f, 8f)
                horizontalLineTo(13f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Upload!!
    }

private var _Upload: ImageVector? = null


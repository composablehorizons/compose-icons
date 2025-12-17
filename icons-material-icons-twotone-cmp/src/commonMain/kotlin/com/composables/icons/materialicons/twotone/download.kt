package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Download: ImageVector
    get() {
        if (_Download != null) return _Download!!
        
        _Download = ImageVector.Builder(
            name = "download",
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
                moveTo(13f, 9f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineTo(9.83f)
                lineTo(12f, 13.17f)
                lineTo(14.17f, 11f)
                horizontalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 9f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineToRelative(6f)
                horizontalLineTo(5f)
                lineToRelative(7f, 7f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-3f, 4.17f)
                lineTo(9.83f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.17f)
                lineTo(12f, 13.17f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Download!!
    }

private var _Download: ImageVector? = null


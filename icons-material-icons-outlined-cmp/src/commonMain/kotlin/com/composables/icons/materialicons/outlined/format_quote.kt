package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_quote: ImageVector
    get() {
        if (_Format_quote != null) return _Format_quote!!
        
        _Format_quote = ImageVector.Builder(
            name = "format_quote",
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
                moveTo(18.62f, 18f)
                horizontalLineToRelative(-5.24f)
                lineToRelative(2f, -4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7.24f)
                lineTo(18.62f, 18f)
                close()
                moveToRelative(-2f, -2f)
                horizontalLineToRelative(0.76f)
                lineTo(19f, 12.76f)
                verticalLineTo(8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.62f)
                lineToRelative(-2f, 4f)
                close()
                moveToRelative(-8f, 2f)
                horizontalLineTo(3.38f)
                lineToRelative(2f, -4f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7.24f)
                lineTo(8.62f, 18f)
                close()
                moveToRelative(-2f, -2f)
                horizontalLineToRelative(0.76f)
                lineTo(9f, 12.76f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.62f)
                lineToRelative(-2f, 4f)
                close()
            }
        }.build()
        
        return _Format_quote!!
    }

private var _Format_quote: ImageVector? = null


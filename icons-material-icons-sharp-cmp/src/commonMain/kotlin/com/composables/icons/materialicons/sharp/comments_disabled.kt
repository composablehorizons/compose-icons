package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Comments_disabled: ImageVector
    get() {
        if (_Comments_disabled != null) return _Comments_disabled!!
        
        _Comments_disabled = ImageVector.Builder(
            name = "comments_disabled",
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
                moveTo(16.83f, 14f)
                horizontalLineTo(18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(8.83f)
                lineToRelative(-4f, -4f)
                horizontalLineTo(22f)
                verticalLineToRelative(17.17f)
                lineTo(16.83f, 14f)
                close()
                moveTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineTo(2f, 4.83f)
                verticalLineTo(18f)
                horizontalLineToRelative(13.17f)
                lineToRelative(5.31f, 5.31f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(0.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                close()
                moveTo(6f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Comments_disabled!!
    }

private var _Comments_disabled: ImageVector? = null


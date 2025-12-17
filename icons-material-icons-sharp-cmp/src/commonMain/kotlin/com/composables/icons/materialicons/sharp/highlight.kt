package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Highlight: ImageVector
    get() {
        if (_Highlight != null) return _Highlight!!
        
        _Highlight = ImageVector.Builder(
            name = "highlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 14f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                lineToRelative(3f, -3f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(5f, -12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                close()
                moveTo(3.5f, 5.88f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineTo(5.62f, 8f)
                lineTo(3.5f, 5.88f)
                close()
                moveToRelative(13.46f, 0.71f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.41f, 1.41f)
                lineTo(18.38f, 8f)
                lineToRelative(-1.42f, -1.41f)
                close()
            }
        }.build()
        
        return _Highlight!!
    }

private var _Highlight: ImageVector? = null


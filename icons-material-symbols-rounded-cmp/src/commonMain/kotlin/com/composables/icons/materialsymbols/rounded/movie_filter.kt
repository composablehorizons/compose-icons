package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Movie_filter: ImageVector
    get() {
        if (_Movie_filter != null) return _Movie_filter!!
        
        _Movie_filter = ImageVector.Builder(
            name = "movie_filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 11f)
                lineToRelative(-0.95f, 2.05f)
                lineTo(6.5f, 14f)
                lineToRelative(2.05f, 0.95f)
                lineTo(9.5f, 17f)
                lineToRelative(0.95f, -2.05f)
                lineTo(12.5f, 14f)
                lineToRelative(-2.05f, -0.95f)
                close()
                moveToRelative(6f, 0f)
                lineToRelative(-0.65f, 1.35f)
                lineToRelative(-1.35f, 0.65f)
                lineToRelative(1.35f, 0.65f)
                lineToRelative(0.65f, 1.35f)
                lineToRelative(0.65f, -1.35f)
                lineTo(17.5f, 13f)
                lineToRelative(-1.35f, -0.65f)
                close()
                moveTo(4f, 4f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(3f)
                lineTo(7f, 4f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(3f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(3f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(3f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 5.175f, 22f, 6f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 18.825f, 2f, 18f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 4f, 4f, 4f)
                close()
                moveToRelative(0f, 6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Movie_filter!!
    }

private var _Movie_filter: ImageVector? = null


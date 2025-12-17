package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Movie_filter: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 4f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2f, -3f)
                horizontalLineToRelative(-2f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2f, -3f)
                horizontalLineTo(8f)
                lineToRelative(2f, 3f)
                horizontalLineTo(7f)
                lineTo(5f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-6.75f, 11.25f)
                lineTo(10f, 18f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(6f, 14f)
                lineToRelative(2.75f, -1.25f)
                lineTo(10f, 10f)
                lineToRelative(1.25f, 2.75f)
                lineTo(14f, 14f)
                lineToRelative(-2.75f, 1.25f)
                close()
                moveToRelative(5.69f, -3.31f)
                lineTo(16f, 14f)
                lineToRelative(-0.94f, -2.06f)
                lineTo(13f, 11f)
                lineToRelative(2.06f, -0.94f)
                lineTo(16f, 8f)
                lineToRelative(0.94f, 2.06f)
                lineTo(19f, 11f)
                lineToRelative(-2.06f, 0.94f)
                close()
            }
        }.build()
        
        return _Movie_filter!!
    }

private var _Movie_filter: ImageVector? = null


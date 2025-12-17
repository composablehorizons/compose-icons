package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Movie_filter: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.63f, 11.37f)
                lineTo(18f, 12f)
                lineToRelative(-1.37f, 0.63f)
                lineTo(16f, 14f)
                lineToRelative(-0.63f, -1.37f)
                lineTo(14f, 12f)
                lineToRelative(1.37f, -0.63f)
                lineTo(16f, 10f)
                horizontalLineTo(5.77f)
                lineTo(4.01f, 6.47f)
                verticalLineTo(18f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8f)
                horizontalLineTo(16f)
                lineToRelative(0.63f, 1.37f)
                close()
                moveToRelative(-5.69f, 3.57f)
                lineTo(10f, 17f)
                lineToRelative(-0.94f, -2.06f)
                lineTo(7f, 14f)
                lineToRelative(2.06f, -0.94f)
                lineTo(10f, 11f)
                lineToRelative(0.94f, 2.06f)
                lineTo(13f, 14f)
                lineToRelative(-2.06f, 0.94f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 11f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(7f, 14f)
                lineToRelative(2.06f, 0.94f)
                lineTo(10f, 17f)
                lineToRelative(0.94f, -2.06f)
                lineTo(13f, 14f)
                lineToRelative(-2.06f, -0.94f)
                close()
                moveToRelative(8.01f, -7f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(-2f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(-2f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineToRelative(-0.01f, 12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3.99f)
                close()
                moveToRelative(2f, 14f)
                horizontalLineToRelative(-16f)
                verticalLineTo(6.47f)
                lineTo(5.77f, 10f)
                horizontalLineTo(16f)
                lineToRelative(-0.63f, 1.37f)
                lineTo(14f, 12f)
                lineToRelative(1.37f, 0.63f)
                lineTo(16f, 14f)
                lineToRelative(0.63f, -1.37f)
                lineTo(18f, 12f)
                lineToRelative(-1.37f, -0.63f)
                lineTo(16f, 10f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Movie_filter!!
    }

private var _Movie_filter: ImageVector? = null


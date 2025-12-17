package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Score: ImageVector
    get() {
        if (_Score != null) return _Score!!
        
        _Score = ImageVector.Builder(
            name = "score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveToRelative(-9f, 2f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                lineToRelative(2f, -3f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-2f, 3f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2f, -3f)
                verticalLineToRelative(3f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                close()
                moveTo(7f, 7.25f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.75f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(7.25f)
                close()
                moveTo(19f, 13f)
                lineToRelative(-6f, 6f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-2.5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineToRelative(6f, -6f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null


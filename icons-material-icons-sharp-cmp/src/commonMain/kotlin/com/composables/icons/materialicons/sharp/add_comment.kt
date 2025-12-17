package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_comment: ImageVector
    get() {
        if (_Add_comment != null) return _Add_comment!!
        
        _Add_comment = ImageVector.Builder(
            name = "add_comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                lineToRelative(4f, 4f)
                verticalLineTo(2f)
                close()
                moveToRelative(-5f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineToRelative(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Add_comment!!
    }

private var _Add_comment: ImageVector? = null


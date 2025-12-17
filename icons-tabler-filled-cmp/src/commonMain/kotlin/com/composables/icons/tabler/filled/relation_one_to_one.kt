package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.RelationOneToOne: ImageVector
    get() {
        if (_RelationOneToOne != null) return _RelationOneToOne!!
        
        _RelationOneToOne = ImageVector.Builder(
            name = "relation-one-to-one",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-10f, 5f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(7f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(-4f, 3.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(0f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _RelationOneToOne!!
    }

private var _RelationOneToOne: ImageVector? = null


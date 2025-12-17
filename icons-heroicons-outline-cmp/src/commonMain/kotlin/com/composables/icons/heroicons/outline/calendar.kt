package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Calendar: ImageVector
    get() {
        if (_Calendar != null) return _Calendar!!
        
        _Calendar = ImageVector.Builder(
            name = "calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6.75f, 3f)
                verticalLineToRelative(2.25f)
                moveTo(17.25f, 3f)
                verticalLineToRelative(2.25f)
                moveTo(3f, 18.75f)
                verticalLineTo(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 21f, 7.5f)
                verticalLineToRelative(11.25f)
                moveToRelative(-18f, 0f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5.25f, 21f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 18.75f)
                moveToRelative(-18f, 0f)
                verticalLineToRelative(-7.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.25f, 9f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 21f, 11.25f)
                verticalLineToRelative(7.5f)
            }
        }.build()
        
        return _Calendar!!
    }

private var _Calendar: ImageVector? = null


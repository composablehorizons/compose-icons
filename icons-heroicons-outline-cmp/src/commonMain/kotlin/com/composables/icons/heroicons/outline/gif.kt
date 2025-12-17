package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
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
                moveTo(12.75f, 8.25f)
                verticalLineToRelative(7.5f)
                moveToRelative(6f, -7.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(12f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.75f)
                moveToRelative(0f, -3.75f)
                horizontalLineTo(18f)
                moveTo(9.75f, 9.348f)
                curveToRelative(-1.03f, -1.464f, -2.698f, -1.464f, -3.728f, 0f)
                curveToRelative(-1.03f, 1.465f, -1.03f, 3.84f, 0f, 5.304f)
                curveToRelative(1.03f, 1.464f, 2.699f, 1.464f, 3.728f, 0f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1.5f)
                moveTo(4.5f, 19.5f)
                horizontalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(6.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 19.5f, 4.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(10.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.5f, 19.5f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null


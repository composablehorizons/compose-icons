package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.UserGroup: ImageVector
    get() {
        if (_UserGroup != null) return _UserGroup!!
        
        _UserGroup = ImageVector.Builder(
            name = "user-group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(18f, 18.72f)
                arcToRelative(9.094f, 9.094f, 0f, false, false, 3.741f, -0.479f)
                arcToRelative(3f, 3f, 0f, false, false, -4.682f, -2.72f)
                moveToRelative(0.94f, 3.198f)
                lineToRelative(0.001f, 0.031f)
                curveToRelative(0f, 0.225f, -0.012f, 0.447f, -0.037f, 0.666f)
                arcTo(11.944f, 11.944f, 0f, false, true, 12f, 21f)
                curveToRelative(-2.17f, 0f, -4.207f, -0.576f, -5.963f, -1.584f)
                arcTo(6.062f, 6.062f, 0f, false, true, 6f, 18.719f)
                moveToRelative(12f, 0f)
                arcToRelative(5.971f, 5.971f, 0f, false, false, -0.941f, -3.197f)
                moveToRelative(0f, 0f)
                arcTo(5.995f, 5.995f, 0f, false, false, 12f, 12.75f)
                arcToRelative(5.995f, 5.995f, 0f, false, false, -5.058f, 2.772f)
                moveToRelative(0f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -4.681f, 2.72f)
                arcToRelative(8.986f, 8.986f, 0f, false, false, 3.74f, 0.477f)
                moveToRelative(0.94f, -3.197f)
                arcToRelative(5.971f, 5.971f, 0f, false, false, -0.94f, 3.197f)
                moveTo(15f, 6.75f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
                moveToRelative(6f, 3f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, -4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 4.5f, 0f)
                close()
                moveToRelative(-13.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, -4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 4.5f, 0f)
                close()
            }
        }.build()
        
        return _UserGroup!!
    }

private var _UserGroup: ImageVector? = null


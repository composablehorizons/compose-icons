package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArchiveBoxXMark: ImageVector
    get() {
        if (_ArchiveBoxXMark != null) return _ArchiveBoxXMark!!
        
        _ArchiveBoxXMark = ImageVector.Builder(
            name = "archive-box-x-mark",
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
                moveTo(20.25f, 7.5f)
                lineToRelative(-0.625f, 10.632f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.247f, 2.118f)
                horizontalLineTo(6.622f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.247f, -2.118f)
                lineTo(3.75f, 7.5f)
                moveToRelative(6f, 4.125f)
                lineToRelative(2.25f, 2.25f)
                moveToRelative(0f, 0f)
                lineToRelative(2.25f, 2.25f)
                moveTo(12f, 13.875f)
                lineToRelative(2.25f, -2.25f)
                moveTo(12f, 13.875f)
                lineToRelative(-2.25f, 2.25f)
                moveTo(3.375f, 7.5f)
                horizontalLineToRelative(17.25f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(3.375f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                close()
            }
        }.build()
        
        return _ArchiveBoxXMark!!
    }

private var _ArchiveBoxXMark: ImageVector? = null


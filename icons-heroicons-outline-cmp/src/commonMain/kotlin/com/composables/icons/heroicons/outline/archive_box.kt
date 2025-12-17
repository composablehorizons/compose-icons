package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArchiveBox: ImageVector
    get() {
        if (_ArchiveBox != null) return _ArchiveBox!!
        
        _ArchiveBox = ImageVector.Builder(
            name = "archive-box",
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
                moveTo(20.25f, 7.5f)
                lineToRelative(-0.625f, 10.632f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.247f, 2.118f)
                horizontalLineTo(6.622f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.247f, -2.118f)
                lineTo(3.75f, 7.5f)
                moveTo(10f, 11.25f)
                horizontalLineToRelative(4f)
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
        
        return _ArchiveBox!!
    }

private var _ArchiveBox: ImageVector? = null


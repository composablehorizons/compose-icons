package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DocumentDuplicate: ImageVector
    get() {
        if (_DocumentDuplicate != null) return _DocumentDuplicate!!
        
        _DocumentDuplicate = ImageVector.Builder(
            name = "document-duplicate",
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
                moveTo(15.75f, 17.25f)
                verticalLineToRelative(3.375f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-9.75f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                verticalLineTo(7.875f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineTo(6.75f)
                arcToRelative(9.06f, 9.06f, 0f, false, true, 1.5f, 0.124f)
                moveToRelative(7.5f, 10.376f)
                horizontalLineToRelative(3.375f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(11.25f)
                curveToRelative(0f, -4.46f, -3.243f, -8.161f, -7.5f, -8.876f)
                arcToRelative(9.06f, 9.06f, 0f, false, false, -1.5f, -0.124f)
                horizontalLineTo(9.375f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(3.5f)
                moveToRelative(7.5f, 10.375f)
                horizontalLineTo(9.375f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                verticalLineToRelative(-9.25f)
                moveToRelative(12f, 6.625f)
                verticalLineToRelative(-1.875f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineTo(9.75f)
            }
        }.build()
        
        return _DocumentDuplicate!!
    }

private var _DocumentDuplicate: ImageVector? = null


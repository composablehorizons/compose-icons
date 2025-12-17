package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PencilSquare: ImageVector
    get() {
        if (_PencilSquare != null) return _PencilSquare!!
        
        _PencilSquare = ImageVector.Builder(
            name = "pencil-square",
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
                moveTo(16.862f, 4.487f)
                lineToRelative(1.687f, -1.688f)
                arcToRelative(1.875f, 1.875f, 0f, true, true, 2.652f, 2.652f)
                lineTo(10.582f, 16.07f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.897f, 1.13f)
                lineTo(6f, 18f)
                lineToRelative(0.8f, -2.685f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.13f, -1.897f)
                lineToRelative(8.932f, -8.931f)
                close()
                moveToRelative(0f, 0f)
                lineTo(19.5f, 7.125f)
                moveTo(18f, 14f)
                verticalLineToRelative(4.75f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 21f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 18.75f)
                verticalLineTo(8.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.25f, 6f)
                horizontalLineTo(10f)
            }
        }.build()
        
        return _PencilSquare!!
    }

private var _PencilSquare: ImageVector? = null


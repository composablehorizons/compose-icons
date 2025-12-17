package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Window: ImageVector
    get() {
        if (_Window != null) return _Window!!
        
        _Window = ImageVector.Builder(
            name = "window",
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
                moveTo(3f, 8.25f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 18f)
                verticalLineTo(8.25f)
                moveToRelative(-18f, 0f)
                verticalLineTo(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 21f, 6f)
                verticalLineToRelative(2.25f)
                moveToRelative(-18f, 0f)
                horizontalLineToRelative(18f)
                moveTo(5.25f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(5.25f)
                verticalLineTo(6f)
                close()
                moveTo(7.5f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(7.5f)
                verticalLineTo(6f)
                close()
                moveToRelative(2.25f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(9.75f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Window!!
    }

private var _Window: ImageVector? = null


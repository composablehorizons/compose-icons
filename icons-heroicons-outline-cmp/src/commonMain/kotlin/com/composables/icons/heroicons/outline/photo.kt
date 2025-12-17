package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Photo: ImageVector
    get() {
        if (_Photo != null) return _Photo!!
        
        _Photo = ImageVector.Builder(
            name = "photo",
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
                moveTo(2.25f, 15.75f)
                lineToRelative(5.159f, -5.159f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 3.182f, 0f)
                lineToRelative(5.159f, 5.159f)
                moveToRelative(-1.5f, -1.5f)
                lineToRelative(1.409f, -1.409f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 3.182f, 0f)
                lineToRelative(2.909f, 2.909f)
                moveToRelative(-18f, 3.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineTo(3.75f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                close()
                moveToRelative(10.5f, -11.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(8.25f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
            }
        }.build()
        
        return _Photo!!
    }

private var _Photo: ImageVector? = null


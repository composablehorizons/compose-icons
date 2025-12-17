package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ViewfinderCircle: ImageVector
    get() {
        if (_ViewfinderCircle != null) return _ViewfinderCircle!!
        
        _ViewfinderCircle = ImageVector.Builder(
            name = "viewfinder-circle",
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
                moveTo(7.5f, 3.75f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.75f, 6f)
                verticalLineToRelative(1.5f)
                moveTo(16.5f, 3.75f)
                horizontalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 20.25f, 6f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 9f)
                verticalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 20.25f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-9f, 0f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.75f, 18f)
                verticalLineToRelative(-1.5f)
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _ViewfinderCircle!!
    }

private var _ViewfinderCircle: ImageVector? = null


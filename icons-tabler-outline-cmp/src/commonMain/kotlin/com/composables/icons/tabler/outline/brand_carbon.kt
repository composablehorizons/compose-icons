package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCarbon: ImageVector
    get() {
        if (_BrandCarbon != null) return _BrandCarbon!!
        
        _BrandCarbon = ImageVector.Builder(
            name = "brand-carbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                verticalLineToRelative(-0.2f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -1.8f, -1.8f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -1.8f, 1.8f)
                verticalLineToRelative(4.4f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 1.8f, 1.8f)
                horizontalLineToRelative(0.4f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 1.8f, -1.8f)
                verticalLineToRelative(-0.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                moveToRelative(0f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                close()
            }
        }.build()
        
        return _BrandCarbon!!
    }

private var _BrandCarbon: ImageVector? = null


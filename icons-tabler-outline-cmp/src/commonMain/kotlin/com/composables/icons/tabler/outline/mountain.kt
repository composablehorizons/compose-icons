package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Mountain: ImageVector
    get() {
        if (_Mountain != null) return _Mountain!!
        
        _Mountain = ImageVector.Builder(
            name = "mountain",
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
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                lineToRelative(-6.921f, -14.612f)
                arcToRelative(2.3f, 2.3f, 0f, false, false, -4.158f, 0f)
                lineToRelative(-6.921f, 14.612f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 11f)
                lineToRelative(2f, 2.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2f, 3f)
                lineToRelative(2.5f, -2f)
            }
        }.build()
        
        return _Mountain!!
    }

private var _Mountain: ImageVector? = null


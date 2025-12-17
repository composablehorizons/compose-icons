package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Moneybag: ImageVector
    get() {
        if (_Moneybag != null) return _Moneybag!!
        
        _Moneybag = ImageVector.Builder(
            name = "moneybag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 3f)
                horizontalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, -3.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 17f)
                verticalLineToRelative(-1f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
            }
        }.build()
        
        return _Moneybag!!
    }

private var _Moneybag: ImageVector? = null


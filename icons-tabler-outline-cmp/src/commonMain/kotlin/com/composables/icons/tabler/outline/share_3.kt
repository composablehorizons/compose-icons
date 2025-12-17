package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Share3: ImageVector
    get() {
        if (_Share3 != null) return _Share3!!
        
        _Share3 = ImageVector.Builder(
            name = "share-3",
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
                moveTo(13f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(-6.575f, 1.028f, -9.02f, 6.788f, -10f, 12f)
                curveToRelative(-0.037f, 0.206f, 5.384f, -5.962f, 10f, -6f)
                verticalLineToRelative(4f)
                lineToRelative(8f, -7f)
                lineToRelative(-8f, -7f)
                close()
            }
        }.build()
        
        return _Share3!!
    }

private var _Share3: ImageVector? = null


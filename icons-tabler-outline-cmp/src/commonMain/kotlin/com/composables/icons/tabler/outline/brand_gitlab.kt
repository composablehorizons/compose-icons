package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGitlab: ImageVector
    get() {
        if (_BrandGitlab != null) return _BrandGitlab!!
        
        _BrandGitlab = ImageVector.Builder(
            name = "brand-gitlab",
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
                moveTo(21f, 14f)
                lineToRelative(-9f, 7f)
                lineToRelative(-9f, -7f)
                lineToRelative(3f, -11f)
                lineToRelative(3f, 7f)
                horizontalLineToRelative(6f)
                lineToRelative(3f, -7f)
                close()
            }
        }.build()
        
        return _BrandGitlab!!
    }

private var _BrandGitlab: ImageVector? = null


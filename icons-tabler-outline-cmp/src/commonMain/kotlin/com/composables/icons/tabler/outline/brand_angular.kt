package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAngular: ImageVector
    get() {
        if (_BrandAngular != null) return _BrandAngular!!
        
        _BrandAngular = ImageVector.Builder(
            name = "brand-angular",
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
                moveTo(5.428f, 17.245f)
                lineToRelative(6.076f, 3.471f)
                arcToRelative(1f, 1f, 0f, false, false, 0.992f, 0f)
                lineToRelative(6.076f, -3.471f)
                arcToRelative(1f, 1f, 0f, false, false, 0.495f, -0.734f)
                lineToRelative(1.323f, -9.704f)
                arcToRelative(1f, 1f, 0f, false, false, -0.658f, -1.078f)
                lineToRelative(-7.4f, -2.612f)
                arcToRelative(1f, 1f, 0f, false, false, -0.665f, 0f)
                lineToRelative(-7.399f, 2.613f)
                arcToRelative(1f, 1f, 0f, false, false, -0.658f, 1.078f)
                lineToRelative(1.323f, 9.704f)
                arcToRelative(1f, 1f, 0f, false, false, 0.495f, 0.734f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                lineToRelative(3f, -8f)
                lineToRelative(3f, 8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                horizontalLineToRelative(4f)
            }
        }.build()
        
        return _BrandAngular!!
    }

private var _BrandAngular: ImageVector? = null


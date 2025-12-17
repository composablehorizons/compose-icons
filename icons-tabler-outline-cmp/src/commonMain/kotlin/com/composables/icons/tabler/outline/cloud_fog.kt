package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CloudFog: ImageVector
    get() {
        if (_CloudFog != null) return _CloudFog!!
        
        _CloudFog = ImageVector.Builder(
            name = "cloud-fog",
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
                moveTo(7f, 16f)
                arcToRelative(4.6f, 4.4f, 0f, false, true, 0f, -9f)
                arcToRelative(5f, 4.5f, 0f, false, true, 11f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineToRelative(-12f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 20f)
                lineToRelative(14f, 0f)
            }
        }.build()
        
        return _CloudFog!!
    }

private var _CloudFog: ImageVector? = null


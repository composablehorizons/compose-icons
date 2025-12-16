package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.CloudLightning: ImageVector
    get() {
        if (_CloudLightning != null) return _CloudLightning!!
        
        _CloudLightning = ImageVector.Builder(
            name = "cloud-lightning",
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
                moveTo(19f, 16.9f)
                arcTo(5f, 5f, 0f, false, false, 18f, 7f)
                horizontalLineToRelative(-1.26f)
                arcToRelative(8f, 8f, 0f, true, false, -11.62f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                lineTo(9f, 17f)
                lineTo(15f, 17f)
                lineTo(11f, 23f)
            }
        }.build()
        
        return _CloudLightning!!
    }

private var _CloudLightning: ImageVector? = null


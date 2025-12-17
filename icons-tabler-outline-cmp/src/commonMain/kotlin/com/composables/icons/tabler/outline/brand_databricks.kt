package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDatabricks: ImageVector
    get() {
        if (_BrandDatabricks != null) return _BrandDatabricks!!
        
        _BrandDatabricks = ImageVector.Builder(
            name = "brand-databricks",
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
                moveTo(3f, 17f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                verticalLineToRelative(-3f)
                lineToRelative(-9f, 5f)
                lineToRelative(-9f, -5f)
                verticalLineToRelative(-3f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                verticalLineToRelative(-3f)
                lineToRelative(-9f, 5f)
                lineToRelative(-9f, -5f)
                lineToRelative(9f, -5f)
                lineToRelative(5.418f, 3.01f)
            }
        }.build()
        
        return _BrandDatabricks!!
    }

private var _BrandDatabricks: ImageVector? = null


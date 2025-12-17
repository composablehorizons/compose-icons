package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSupabase: ImageVector
    get() {
        if (_BrandSupabase != null) return _BrandSupabase!!
        
        _BrandSupabase = ImageVector.Builder(
            name = "brand-supabase",
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
                moveTo(4f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                lineToRelative(8f, -11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-7f)
                close()
            }
        }.build()
        
        return _BrandSupabase!!
    }

private var _BrandSupabase: ImageVector? = null


package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTerraform: ImageVector
    get() {
        if (_BrandTerraform != null) return _BrandTerraform!!
        
        _BrandTerraform = ImageVector.Builder(
            name = "brand-terraform",
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
                moveTo(15f, 15.5f)
                lineToRelative(-11.476f, -6.216f)
                arcToRelative(1f, 1f, 0f, false, true, -0.524f, -0.88f)
                verticalLineToRelative(-4.054f)
                arcToRelative(1.35f, 1.35f, 0f, false, true, 2.03f, -1.166f)
                lineToRelative(9.97f, 5.816f)
                verticalLineToRelative(10.65f)
                arcToRelative(1.35f, 1.35f, 0f, false, true, -2.03f, 1.166f)
                lineToRelative(-3.474f, -2.027f)
                arcToRelative(1f, 1f, 0f, false, true, -0.496f, -0.863f)
                verticalLineToRelative(-11.926f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15.5f)
                lineToRelative(5.504f, -3.21f)
                arcToRelative(1f, 1f, 0f, false, false, 0.496f, -0.864f)
                verticalLineToRelative(-3.576f)
                arcToRelative(1.35f, 1.35f, 0f, false, false, -2.03f, -1.166f)
                lineToRelative(-3.97f, 2.316f)
            }
        }.build()
        
        return _BrandTerraform!!
    }

private var _BrandTerraform: ImageVector? = null


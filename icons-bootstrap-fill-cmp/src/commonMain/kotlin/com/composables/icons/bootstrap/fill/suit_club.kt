package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SuitClub: ImageVector
    get() {
        if (_SuitClub != null) return _SuitClub!!
        
        _SuitClub = ImageVector.Builder(
            name = "suit-club",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -2.684f, -1.254f)
                arcToRelative(20f, 20f, 0f, false, false, 1.582f, 2.907f)
                curveToRelative(0.231f, 0.35f, -0.02f, 0.847f, -0.438f, 0.847f)
                horizontalLineTo(6.04f)
                curveToRelative(-0.419f, 0f, -0.67f, -0.497f, -0.438f, -0.847f)
                arcToRelative(20f, 20f, 0f, false, false, 1.582f, -2.907f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -2.538f, -5.743f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 6.708f, 0f)
                arcTo(3.5f, 3.5f, 0f, true, true, 11.5f, 12.5f)
            }
        }.build()
        
        return _SuitClub!!
    }

private var _SuitClub: ImageVector? = null


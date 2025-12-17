package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Nut: ImageVector
    get() {
        if (_Nut != null) return _Nut!!
        
        _Nut = ImageVector.Builder(
            name = "nut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.58f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.868f, 0.504f)
                lineToRelative(-3.428f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 0.992f)
                lineToRelative(3.428f, 6f)
                arcTo(1f, 1f, 0f, false, false, 4.58f, 15f)
                horizontalLineToRelative(6.84f)
                arcToRelative(1f, 1f, 0f, false, false, 0.868f, -0.504f)
                lineToRelative(3.429f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -0.992f)
                lineToRelative(-3.429f, -6f)
                arcTo(1f, 1f, 0f, false, false, 11.42f, 1f)
                close()
                moveToRelative(5.018f, 9.696f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, -5.196f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 5.196f)
            }
        }.build()
        
        return _Nut!!
    }

private var _Nut: ImageVector? = null


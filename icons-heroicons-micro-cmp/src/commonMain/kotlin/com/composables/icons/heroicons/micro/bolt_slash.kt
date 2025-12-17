package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BoltSlash: ImageVector
    get() {
        if (_BoltSlash != null) return _BoltSlash!!
        
        _BoltSlash = ImageVector.Builder(
            name = "bolt-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.58f, 1.077f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.405f, 0.82f)
                lineTo(9.165f, 6f)
                horizontalLineToRelative(4.085f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.567f, 1.241f)
                lineToRelative(-1.904f, 2.197f)
                lineTo(6.385f, 3.91f)
                lineTo(8.683f, 1.26f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.897f, -0.182f)
                close()
                moveTo(4.087f, 6.562f)
                lineToRelative(5.528f, 5.528f)
                lineToRelative(-2.298f, 2.651f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.302f, -0.638f)
                lineTo(6.835f, 10f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.567f, -1.241f)
                lineToRelative(1.904f, -2.197f)
                close()
                moveTo(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(10.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _BoltSlash!!
    }

private var _BoltSlash: ImageVector? = null


package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowRightCircle: ImageVector
    get() {
        if (_ArrowRightCircle != null) return _ArrowRightCircle!!
        
        _ArrowRightCircle = ImageVector.Builder(
            name = "arrow-right-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, false, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, false, 14f, 0f)
                close()
                moveTo(4.75f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.69f)
                lineTo(8.22f, 9.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.22f, 1.22f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _ArrowRightCircle!!
    }

private var _ArrowRightCircle: ImageVector? = null


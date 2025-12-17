package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowDownCircle: ImageVector
    get() {
        if (_ArrowDownCircle != null) return _ArrowDownCircle!!
        
        _ArrowDownCircle = ImageVector.Builder(
            name = "arrow-down-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, false, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, 14f)
                close()
                moveToRelative(0.75f, -10.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(4.69f)
                lineTo(6.03f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineTo(8.75f, 9.44f)
                verticalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _ArrowDownCircle!!
    }

private var _ArrowDownCircle: ImageVector? = null


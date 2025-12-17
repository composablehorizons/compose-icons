package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.414f, 3f)
                curveToRelative(-0.464f, 0f, -0.909f, 0.184f, -1.237f, 0.513f)
                lineTo(1.22f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(3.957f, 3.957f)
                arcTo(1.75f, 1.75f, 0f, false, false, 6.414f, 13f)
                horizontalLineToRelative(5.836f)
                arcTo(2.75f, 2.75f, 0f, false, false, 15f, 10.25f)
                verticalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 12.25f, 3f)
                horizontalLineTo(6.414f)
                close()
                moveTo(8.28f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineTo(8.44f, 8f)
                lineTo(7.22f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineTo(9.5f, 9.06f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(10.56f, 8f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(9.5f, 6.94f)
                lineTo(8.28f, 5.72f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null


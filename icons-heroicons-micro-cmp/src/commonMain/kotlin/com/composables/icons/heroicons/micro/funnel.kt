package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Funnel: ImageVector
    get() {
        if (_Funnel != null) return _Funnel!!
        
        _Funnel = ImageVector.Builder(
            name = "funnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, false, 0.586f, 1.414f)
                lineToRelative(2.828f, 2.828f)
                arcTo(2f, 2f, 0f, false, true, 6f, 9.828f)
                verticalLineToRelative(4.363f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.724f, 0.447f)
                lineToRelative(2.17f, -1.085f)
                arcTo(2f, 2f, 0f, false, false, 10f, 11.763f)
                verticalLineTo(9.829f)
                arcToRelative(2f, 2f, 0f, false, true, 0.586f, -1.414f)
                lineToRelative(2.828f, -2.828f)
                arcTo(2f, 2f, 0f, false, false, 14f, 4.172f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Funnel!!
    }

private var _Funnel: ImageVector? = null


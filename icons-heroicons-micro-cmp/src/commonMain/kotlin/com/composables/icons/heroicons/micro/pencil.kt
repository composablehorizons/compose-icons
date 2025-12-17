package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Pencil: ImageVector
    get() {
        if (_Pencil != null) return _Pencil!!
        
        _Pencil = ImageVector.Builder(
            name = "pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.013f, 2.513f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, 2.475f, 2.474f)
                lineTo(6.226f, 12.25f)
                arcToRelative(2.751f, 2.751f, 0f, false, true, -0.892f, 0.596f)
                lineToRelative(-2.047f, 0.848f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.98f, -0.98f)
                lineToRelative(0.848f, -2.047f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 0.596f, -0.892f)
                lineToRelative(7.262f, -7.261f)
                close()
            }
        }.build()
        
        return _Pencil!!
    }

private var _Pencil: ImageVector? = null


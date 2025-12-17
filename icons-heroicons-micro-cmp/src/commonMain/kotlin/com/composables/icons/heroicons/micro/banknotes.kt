package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Banknotes: ImageVector
    get() {
        if (_Banknotes != null) return _Banknotes!!
        
        _Banknotes = ImageVector.Builder(
            name = "banknotes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                close()
                moveToRelative(9f, 3f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                close()
                moveToRelative(-6.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                close()
                moveTo(11.5f, 6f)
                arcTo(0.75f, 0.75f, 0f, true, true, 13f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.179f)
                curveToRelative(0f, 0.15f, -0.138f, 0.28f, -0.306f, 0.255f)
                arcTo(65.277f, 65.277f, 0f, false, false, 1.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                curveToRelative(3.135f, 0f, 6.215f, 0.228f, 9.227f, 0.668f)
                arcTo(1.764f, 1.764f, 0f, false, false, 13f, 11.928f)
                verticalLineToRelative(-0.178f)
                close()
            }
        }.build()
        
        return _Banknotes!!
    }

private var _Banknotes: ImageVector? = null


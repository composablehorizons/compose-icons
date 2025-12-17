package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.GiftTop: ImageVector
    get() {
        if (_GiftTop != null) return _GiftTop!!
        
        _GiftTop = ImageVector.Builder(
            name = "gift-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 2f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(1.718f)
                arcTo(2.5f, 2.5f, 0f, false, true, 7.25f, 3.716f)
                verticalLineTo(2f)
                close()
                moveTo(2f, 8.75f)
                verticalLineToRelative(3.75f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(-3.085f)
                arcToRelative(4.743f, 4.743f, 0f, false, true, -3.455f, 1.826f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.092f, -1.497f)
                arcToRelative(3.252f, 3.252f, 0f, false, false, 2.96f, -2.494f)
                horizontalLineTo(2f)
                close()
                moveTo(8.75f, 14f)
                horizontalLineToRelative(3.75f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(8.75f)
                horizontalLineTo(9.337f)
                arcToRelative(3.252f, 3.252f, 0f, false, false, 2.96f, 2.494f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.093f, 1.497f)
                arcToRelative(4.743f, 4.743f, 0f, false, true, -3.454f, -1.826f)
                verticalLineTo(14f)
                close()
                moveTo(14f, 7.25f)
                horizontalLineToRelative(-1.718f)
                arcTo(2.5f, 2.5f, 0f, false, false, 8.75f, 3.717f)
                verticalLineTo(2f)
                horizontalLineToRelative(3.75f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 3.5f)
                verticalLineToRelative(3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.352f, 6.787f)
                curveToRelative(0.16f, 0.012f, 0.312f, 0.014f, 0.448f, 0.012f)
                curveToRelative(0.002f, -0.136f, 0f, -0.289f, -0.012f, -0.448f)
                curveToRelative(-0.043f, -0.617f, -0.203f, -1.181f, -0.525f, -1.503f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 1.414f)
                curveToRelative(0.322f, 0.322f, 0.886f, 0.482f, 1.503f, 0.525f)
                close()
                moveTo(9.649f, 6.787f)
                curveToRelative(-0.16f, 0.012f, -0.312f, 0.014f, -0.448f, 0.012f)
                curveToRelative(-0.003f, -0.136f, 0f, -0.289f, 0.011f, -0.448f)
                curveToRelative(0.044f, -0.617f, 0.203f, -1.181f, 0.526f, -1.503f)
                arcToRelative(1f, 1f, 0f, true, true, 1.414f, 1.414f)
                curveToRelative(-0.322f, 0.322f, -0.887f, 0.482f, -1.503f, 0.525f)
                close()
            }
        }.build()
        
        return _GiftTop!!
    }

private var _GiftTop: ImageVector? = null


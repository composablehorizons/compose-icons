package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.FingerPrint: ImageVector
    get() {
        if (_FingerPrint != null) return _FingerPrint!!
        
        _FingerPrint = ImageVector.Builder(
            name = "finger-print",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                curveToRelative(-0.988f, 0f, -1.908f, 0.286f, -2.682f, 0.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.806f, -1.266f)
                arcTo(6.5f, 6.5f, 0f, false, true, 14.5f, 8f)
                curveToRelative(0f, 1.665f, -0.333f, 3.254f, -0.936f, 4.704f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.385f, -0.577f)
                curveTo(12.708f, 10.857f, 13f, 9.464f, 13f, 8f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
                close()
                moveTo(3.55f, 4.282f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.23f, 1.036f)
                arcTo(4.973f, 4.973f, 0f, false, false, 3f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                curveToRelative(0f, -1.282f, 0.372f, -2.48f, 1.014f, -3.488f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.036f, -0.23f)
                close()
                moveTo(8f, 5.875f)
                arcTo(2.125f, 2.125f, 0f, false, false, 5.875f, 8f)
                arcToRelative(3.625f, 3.625f, 0f, false, true, -3.625f, 3.625f)
                horizontalLineTo(2.213f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.008f, -1.5f)
                horizontalLineToRelative(0.03f)
                arcTo(2.125f, 2.125f, 0f, false, false, 4.376f, 8f)
                arcToRelative(3.625f, 3.625f, 0f, true, true, 7.25f, 0f)
                curveToRelative(0f, 0.078f, -0.001f, 0.156f, -0.003f, 0.233f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, -0.036f)
                curveToRelative(0.002f, -0.066f, 0.003f, -0.131f, 0.003f, -0.197f)
                arcTo(2.125f, 2.125f, 0f, false, false, 8f, 5.875f)
                close()
                moveTo(7.995f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                arcToRelative(6.502f, 6.502f, 0f, false, true, -4.343f, 6.133f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.498f, -1.415f)
                arcTo(5.002f, 5.002f, 0f, false, false, 7.245f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(2.651f, 2.87f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.463f, 0.955f)
                arcToRelative(9.39f, 9.39f, 0f, false, true, -3.008f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.936f, -1.171f)
                arcToRelative(7.892f, 7.892f, 0f, false, false, 2.527f, -3.57f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.954f, -0.463f)
                close()
            }
        }.build()
        
        return _FingerPrint!!
    }

private var _FingerPrint: ImageVector? = null


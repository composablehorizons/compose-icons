package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CashCoin: ImageVector
    get() {
        if (_CashCoin != null) return _CashCoin!!
        
        _CashCoin = ImageVector.Builder(
            name = "cash-coin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 15f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, 8f)
                moveToRelative(5f, -4f)
                arcToRelative(5f, 5f, 0f, true, true, -10f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.438f, 11.944f)
                curveToRelative(0.047f, 0.596f, 0.518f, 1.06f, 1.363f, 1.116f)
                verticalLineToRelative(0.44f)
                horizontalLineToRelative(0.375f)
                verticalLineToRelative(-0.443f)
                curveToRelative(0.875f, -0.061f, 1.386f, -0.529f, 1.386f, -1.207f)
                curveToRelative(0f, -0.618f, -0.39f, -0.936f, -1.09f, -1.1f)
                lineToRelative(-0.296f, -0.07f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.376f, 0.043f, 0.614f, 0.248f, 0.671f, 0.532f)
                horizontalLineToRelative(0.658f)
                curveToRelative(-0.047f, -0.575f, -0.54f, -1.024f, -1.329f, -1.073f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(-0.375f)
                verticalLineToRelative(0.45f)
                curveToRelative(-0.747f, 0.073f, -1.255f, 0.522f, -1.255f, 1.158f)
                curveToRelative(0f, 0.562f, 0.378f, 0.92f, 1.007f, 1.066f)
                lineToRelative(0.248f, 0.061f)
                verticalLineToRelative(1.272f)
                curveToRelative(-0.384f, -0.058f, -0.639f, -0.27f, -0.696f, -0.563f)
                horizontalLineToRelative(-0.668f)
                close()
                moveToRelative(1.36f, -1.354f)
                curveToRelative(-0.369f, -0.085f, -0.569f, -0.26f, -0.569f, -0.522f)
                curveToRelative(0f, -0.294f, 0.216f, -0.514f, 0.572f, -0.578f)
                verticalLineToRelative(1.1f)
                close()
                moveToRelative(0.432f, 0.746f)
                curveToRelative(0.449f, 0.104f, 0.655f, 0.272f, 0.655f, 0.569f)
                curveToRelative(0f, 0.339f, -0.257f, 0.571f, -0.709f, 0.614f)
                verticalLineToRelative(-1.195f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4.083f)
                quadToRelative(0.088f, -0.517f, 0.258f, -1f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                verticalLineToRelative(3.528f)
                curveToRelative(0.38f, 0.34f, 0.717f, 0.728f, 1f, 1.154f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.998f, 5.083f)
                lineTo(10f, 5f)
                arcToRelative(2f, 2f, 0f, true, false, -3.132f, 1.65f)
                arcToRelative(6f, 6f, 0f, false, true, 3.13f, -1.567f)
            }
        }.build()
        
        return _CashCoin!!
    }

private var _CashCoin: ImageVector? = null


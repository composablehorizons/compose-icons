package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ReceiptEuro: ImageVector
    get() {
        if (_ReceiptEuro != null) return _ReceiptEuro!!
        
        _ReceiptEuro = ImageVector.Builder(
            name = "receipt-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, true, -1.555f, 0.832f)
                lineToRelative(-2.318f, -1.545f)
                lineToRelative(-1.42f, 1.42f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-1.293f, 1.292f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-1.421f, -1.42f)
                lineToRelative(-2.317f, 1.545f)
                arcToRelative(1f, 1f, 0f, false, true, -1.55f, -0.72f)
                lineToRelative(-0.005f, -0.112f)
                verticalLineToRelative(-16f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-3.875f, 4f)
                curveToRelative(-2.046f, 0f, -3.668f, 1.746f, -4.043f, 4f)
                horizontalLineToRelative(-0.082f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.082f)
                curveToRelative(0.376f, 2.254f, 1.997f, 4f, 4.043f, 4f)
                curveToRelative(1.106f, 0f, 2.053f, -0.465f, 2.707f, -1.445f)
                arcToRelative(1f, 1f, 0f, true, false, -1.664f, -1.11f)
                curveToRelative(-0.267f, 0.401f, -0.58f, 0.555f, -1.043f, 0.555f)
                curveToRelative(-0.882f, 0f, -1.7f, -0.814f, -2.002f, -1.999f)
                lineToRelative(1.877f, -0.001f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-1.877f)
                curveToRelative(0.301f, -1.186f, 1.12f, -2f, 2.002f, -2f)
                curveToRelative(0.462f, 0f, 0.776f, 0.154f, 1.043f, 0.555f)
                arcToRelative(1f, 1f, 0f, false, false, 1.664f, -1.11f)
                curveToRelative(-0.654f, -0.98f, -1.6f, -1.445f, -2.707f, -1.445f)
            }
        }.build()
        
        return _ReceiptEuro!!
    }

private var _ReceiptEuro: ImageVector? = null


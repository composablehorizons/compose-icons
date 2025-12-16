package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Gear: ImageVector
    get() {
        if (_Gear != null) return _Gear!!
        
        _Gear = ImageVector.Builder(
            name = "gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.92834f, 0.650246f)
                curveTo(8.3253f, 0.650336f, 8.66968f, 0.92521f, 8.75745f, 1.31236f)
                lineTo(8.99475f, 2.36216f)
                curveTo(9.37407f, 2.47236f, 9.73655f, 2.62282f, 10.0758f, 2.80943f)
                lineTo(10.9869f, 2.23521f)
                curveTo(11.3226f, 2.02392f, 11.76f, 2.07297f, 12.0406f, 2.35337f)
                lineTo(12.6471f, 2.95982f)
                curveTo(12.9277f, 3.24057f, 12.977f, 3.67868f, 12.7653f, 4.0145f)
                lineTo(12.191f, 4.92466f)
                curveTo(12.3775f, 5.2637f, 12.5281f, 5.62568f, 12.6383f, 6.00474f)
                lineTo(13.6881f, 6.24302f)
                curveTo(14.0752f, 6.33086f, 14.3502f, 6.67514f, 14.3502f, 7.07212f)
                verticalLineTo(7.92857f)
                curveTo(14.3502f, 8.32553f, 14.0752f, 8.66981f, 13.6881f, 8.75767f)
                lineTo(12.6383f, 8.99595f)
                curveTo(12.5281f, 9.37514f, 12.3767f, 9.73689f, 12.1901f, 10.076f)
                lineTo(12.7643f, 10.9872f)
                curveTo(12.9759f, 11.323f, 12.9268f, 11.7602f, 12.6461f, 12.0409f)
                lineTo(12.0406f, 12.6473f)
                curveTo(11.7599f, 12.9281f, 11.3218f, 12.9772f, 10.986f, 12.7655f)
                lineTo(10.0748f, 12.1913f)
                curveTo(9.73582f, 12.3777f, 9.37376f, 12.5284f, 8.99475f, 12.6385f)
                lineTo(8.75745f, 13.6883f)
                curveTo(8.66963f, 14.0754f, 8.32526f, 14.3504f, 7.92834f, 14.3504f)
                horizontalLineTo(7.07092f)
                curveTo(6.67397f, 14.3504f, 6.32965f, 14.0754f, 6.24182f, 13.6883f)
                lineTo(6.00354f, 12.6376f)
                curveTo(5.625f, 12.5274f, 5.26403f, 12.3765f, 4.92542f, 12.1903f)
                lineTo(4.01428f, 12.7655f)
                curveTo(3.67846f, 12.9772f, 3.24035f, 12.9279f, 2.95959f, 12.6473f)
                lineTo(2.35315f, 12.0409f)
                curveTo(2.07276f, 11.7603f, 2.02372f, 11.3229f, 2.23499f, 10.9872f)
                lineTo(2.81018f, 10.0751f)
                curveTo(2.62379f, 9.73614f, 2.47209f, 9.37484f, 2.36194f, 8.99595f)
                lineTo(1.31213f, 8.75767f)
                curveTo(0.924966f, 8.66986f, 0.650024f, 8.32557f, 0.650024f, 7.92857f)
                verticalLineTo(7.07212f)
                curveTo(0.650024f, 6.6751f, 0.924951f, 6.33082f, 1.31213f, 6.24302f)
                lineTo(2.36194f, 6.00474f)
                curveTo(2.47203f, 5.62592f, 2.6229f, 5.26449f, 2.8092f, 4.92564f)
                lineTo(2.23499f, 4.0145f)
                curveTo(2.02326f, 3.67863f, 2.0724f, 3.24056f, 2.35315f, 2.95982f)
                lineTo(2.95862f, 2.35435f)
                curveTo(3.23936f, 2.0736f, 3.67744f, 2.02446f, 4.01331f, 2.23618f)
                lineTo(4.92444f, 2.8104f)
                curveTo(5.26333f, 2.62395f, 5.62465f, 2.47237f, 6.00354f, 2.36216f)
                lineTo(6.24182f, 1.31236f)
                curveTo(6.3296f, 0.925173f, 6.67392f, 0.650284f, 7.07092f, 0.650246f)
                horizontalLineTo(7.92834f)
                close()
                moveTo(6.71545f, 3.06821f)
                curveTo(6.05669f, 3.18406f, 5.44722f, 3.44325f, 4.92053f, 3.81236f)
                lineTo(3.56018f, 2.95493f)
                lineTo(2.95374f, 3.56138f)
                lineTo(3.81213f, 4.92173f)
                curveTo(3.44325f, 5.44841f, 3.18369f, 6.05799f, 3.06799f, 6.71665f)
                lineTo(1.49963f, 7.07212f)
                verticalLineTo(7.92857f)
                lineTo(3.06799f, 8.28403f)
                curveTo(3.18375f, 8.94266f, 3.44322f, 9.55232f, 3.81213f, 10.079f)
                lineTo(2.95471f, 11.4403f)
                lineTo(3.56018f, 12.0458f)
                lineTo(4.92151f, 11.1883f)
                curveTo(5.44803f, 11.5571f, 6.05701f, 11.8167f, 6.71545f, 11.9325f)
                lineTo(7.07092f, 13.4999f)
                horizontalLineTo(7.92834f)
                lineTo(8.28381f, 11.9325f)
                curveTo(8.94261f, 11.8168f, 9.55196f, 11.5573f, 10.0787f, 11.1883f)
                lineTo(11.4391f, 12.0467f)
                lineTo(12.0455f, 11.4403f)
                lineTo(11.1881f, 10.0799f)
                curveTo(11.5573f, 9.55311f, 11.8164f, 8.94299f, 11.9323f, 8.28403f)
                lineTo(13.4996f, 7.92857f)
                verticalLineTo(7.07212f)
                lineTo(11.9323f, 6.71665f)
                curveTo(11.8165f, 6.05777f, 11.5572f, 5.44756f, 11.1881f, 4.92075f)
                lineTo(12.0455f, 3.5604f)
                lineTo(11.4401f, 2.95493f)
                lineTo(10.0797f, 3.81236f)
                curveTo(9.55281f, 3.44318f, 8.94285f, 3.18394f, 8.28381f, 3.06821f)
                lineTo(7.92834f, 1.49986f)
                horizontalLineTo(7.07092f)
                lineTo(6.71545f, 3.06821f)
                close()
                moveTo(7.49963f, 5.07505f)
                curveTo(8.8388f, 5.07505f, 9.92529f, 6.16072f, 9.92542f, 7.49986f)
                curveTo(9.92542f, 8.8391f, 8.83888f, 9.92466f, 7.49963f, 9.92466f)
                curveTo(6.16061f, 9.9244f, 5.07483f, 8.83894f, 5.07483f, 7.49986f)
                curveTo(5.07495f, 6.16088f, 6.16069f, 5.07531f, 7.49963f, 5.07505f)
                close()
                moveTo(7.49963f, 5.97544f)
                curveTo(6.65774f, 5.9757f, 5.97534f, 6.65793f, 5.97522f, 7.49986f)
                curveTo(5.97522f, 8.34188f, 6.65767f, 9.02499f, 7.49963f, 9.02525f)
                curveTo(8.34182f, 9.02525f, 9.02502f, 8.34204f, 9.02502f, 7.49986f)
                curveTo(9.0249f, 6.65777f, 8.34174f, 5.97544f, 7.49963f, 5.97544f)
                close()
            }
        }.build()
        
        return _Gear!!
    }

private var _Gear: ImageVector? = null

